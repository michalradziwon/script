
  package gen;
  public class C_Gen17 {
  		@com.google.inject.Inject
  		public C_Gen17(C_Gen18 c_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  