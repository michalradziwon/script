
  package gen;
  public class S_Gen43 {
  		@com.google.inject.Inject
  		public S_Gen43(S_Gen44 s_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  