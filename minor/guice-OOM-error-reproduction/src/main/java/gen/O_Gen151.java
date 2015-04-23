
  package gen;
  public class O_Gen151 {
  		@com.google.inject.Inject
  		public O_Gen151(O_Gen152 o_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  