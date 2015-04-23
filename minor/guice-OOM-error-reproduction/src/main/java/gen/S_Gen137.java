
  package gen;
  public class S_Gen137 {
  		@com.google.inject.Inject
  		public S_Gen137(S_Gen138 s_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  