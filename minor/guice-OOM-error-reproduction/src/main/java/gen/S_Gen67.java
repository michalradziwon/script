
  package gen;
  public class S_Gen67 {
  		@com.google.inject.Inject
  		public S_Gen67(S_Gen68 s_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  