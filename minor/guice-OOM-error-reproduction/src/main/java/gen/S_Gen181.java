
  package gen;
  public class S_Gen181 {
  		@com.google.inject.Inject
  		public S_Gen181(S_Gen182 s_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  