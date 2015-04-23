
  package gen;
  public class S_Gen158 {
  		@com.google.inject.Inject
  		public S_Gen158(S_Gen159 s_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  