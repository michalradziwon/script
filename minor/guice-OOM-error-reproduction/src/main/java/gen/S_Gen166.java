
  package gen;
  public class S_Gen166 {
  		@com.google.inject.Inject
  		public S_Gen166(S_Gen167 s_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  