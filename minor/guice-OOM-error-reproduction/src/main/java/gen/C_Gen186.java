
  package gen;
  public class C_Gen186 {
  		@com.google.inject.Inject
  		public C_Gen186(C_Gen187 c_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  