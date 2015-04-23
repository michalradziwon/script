
  package gen;
  public class C_Gen192 {
  		@com.google.inject.Inject
  		public C_Gen192(C_Gen193 c_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  