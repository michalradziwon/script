
  package gen;
  public class O_Gen167 {
  		@com.google.inject.Inject
  		public O_Gen167(O_Gen168 o_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  