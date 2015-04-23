
  package gen;
  public class C_Gen44 {
  		@com.google.inject.Inject
  		public C_Gen44(C_Gen45 c_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  