
  package gen;
  public class W_Gen167 {
  		@com.google.inject.Inject
  		public W_Gen167(W_Gen168 w_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  