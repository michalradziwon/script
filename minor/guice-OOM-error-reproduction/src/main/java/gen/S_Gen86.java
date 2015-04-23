
  package gen;
  public class S_Gen86 {
  		@com.google.inject.Inject
  		public S_Gen86(S_Gen87 s_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  