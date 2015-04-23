
  package gen;
  public class S_Gen113 {
  		@com.google.inject.Inject
  		public S_Gen113(S_Gen114 s_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  