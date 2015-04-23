
  package gen;
  public class C_Gen150 {
  		@com.google.inject.Inject
  		public C_Gen150(C_Gen151 c_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  