
  package gen;
  public class F_Gen180 {
  		@com.google.inject.Inject
  		public F_Gen180(F_Gen181 f_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  