
  package gen;
  public class S_Gen15 {
  		@com.google.inject.Inject
  		public S_Gen15(S_Gen16 s_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  