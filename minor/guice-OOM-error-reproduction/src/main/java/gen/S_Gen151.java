
  package gen;
  public class S_Gen151 {
  		@com.google.inject.Inject
  		public S_Gen151(S_Gen152 s_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  