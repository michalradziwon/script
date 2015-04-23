
  package gen;
  public class C_Gen4 {
  		@com.google.inject.Inject
  		public C_Gen4(C_Gen5 c_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  