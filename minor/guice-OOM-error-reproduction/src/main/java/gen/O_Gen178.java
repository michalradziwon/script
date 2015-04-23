
  package gen;
  public class O_Gen178 {
  		@com.google.inject.Inject
  		public O_Gen178(O_Gen179 o_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  