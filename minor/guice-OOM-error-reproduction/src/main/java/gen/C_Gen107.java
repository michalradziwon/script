
  package gen;
  public class C_Gen107 {
  		@com.google.inject.Inject
  		public C_Gen107(C_Gen108 c_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  