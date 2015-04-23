
  package gen;
  public class C_Gen158 {
  		@com.google.inject.Inject
  		public C_Gen158(C_Gen159 c_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  