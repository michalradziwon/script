
  package gen;
  public class F_Gen21 {
  		@com.google.inject.Inject
  		public F_Gen21(F_Gen22 f_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  