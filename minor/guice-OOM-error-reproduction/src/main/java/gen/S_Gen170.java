
  package gen;
  public class S_Gen170 {
  		@com.google.inject.Inject
  		public S_Gen170(S_Gen171 s_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  