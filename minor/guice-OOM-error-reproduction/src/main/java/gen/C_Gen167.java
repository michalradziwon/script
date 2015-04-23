
  package gen;
  public class C_Gen167 {
  		@com.google.inject.Inject
  		public C_Gen167(C_Gen168 c_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  