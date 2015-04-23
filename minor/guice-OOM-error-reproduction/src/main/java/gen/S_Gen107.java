
  package gen;
  public class S_Gen107 {
  		@com.google.inject.Inject
  		public S_Gen107(S_Gen108 s_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  