
  package gen;
  public class C_Gen13 {
  		@com.google.inject.Inject
  		public C_Gen13(C_Gen14 c_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  