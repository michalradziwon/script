
  package gen;
  public class S_Gen105 {
  		@com.google.inject.Inject
  		public S_Gen105(S_Gen106 s_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  