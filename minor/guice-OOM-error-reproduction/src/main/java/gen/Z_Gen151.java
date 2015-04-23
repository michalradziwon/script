
  package gen;
  public class Z_Gen151 {
  		@com.google.inject.Inject
  		public Z_Gen151(Z_Gen152 z_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  