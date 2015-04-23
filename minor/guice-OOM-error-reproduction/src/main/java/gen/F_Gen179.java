
  package gen;
  public class F_Gen179 {
  		@com.google.inject.Inject
  		public F_Gen179(F_Gen180 f_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  