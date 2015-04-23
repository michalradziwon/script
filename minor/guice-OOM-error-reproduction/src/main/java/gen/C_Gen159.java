
  package gen;
  public class C_Gen159 {
  		@com.google.inject.Inject
  		public C_Gen159(C_Gen160 c_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  