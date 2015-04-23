
  package gen;
  public class C_Gen181 {
  		@com.google.inject.Inject
  		public C_Gen181(C_Gen182 c_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  