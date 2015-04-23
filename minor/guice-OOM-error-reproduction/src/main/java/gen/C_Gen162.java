
  package gen;
  public class C_Gen162 {
  		@com.google.inject.Inject
  		public C_Gen162(C_Gen163 c_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  