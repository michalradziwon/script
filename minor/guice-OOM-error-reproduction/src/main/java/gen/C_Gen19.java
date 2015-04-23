
  package gen;
  public class C_Gen19 {
  		@com.google.inject.Inject
  		public C_Gen19(C_Gen20 c_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  