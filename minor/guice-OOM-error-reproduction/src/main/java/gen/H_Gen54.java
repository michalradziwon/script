
  package gen;
  public class H_Gen54 {
  		@com.google.inject.Inject
  		public H_Gen54(H_Gen55 h_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  