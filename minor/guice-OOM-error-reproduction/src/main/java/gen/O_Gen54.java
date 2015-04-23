
  package gen;
  public class O_Gen54 {
  		@com.google.inject.Inject
  		public O_Gen54(O_Gen55 o_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  