
  package gen;
  public class C_Gen152 {
  		@com.google.inject.Inject
  		public C_Gen152(C_Gen153 c_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  