
  package gen;
  public class S_Gen163 {
  		@com.google.inject.Inject
  		public S_Gen163(S_Gen164 s_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  