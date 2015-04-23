
  package gen;
  public class S_Gen153 {
  		@com.google.inject.Inject
  		public S_Gen153(S_Gen154 s_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  