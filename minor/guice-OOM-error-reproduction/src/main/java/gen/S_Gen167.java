
  package gen;
  public class S_Gen167 {
  		@com.google.inject.Inject
  		public S_Gen167(S_Gen168 s_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  