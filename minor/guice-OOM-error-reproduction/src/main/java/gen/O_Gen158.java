
  package gen;
  public class O_Gen158 {
  		@com.google.inject.Inject
  		public O_Gen158(O_Gen159 o_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  