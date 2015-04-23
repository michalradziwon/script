
  package gen;
  public class C_Gen7 {
  		@com.google.inject.Inject
  		public C_Gen7(C_Gen8 c_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  