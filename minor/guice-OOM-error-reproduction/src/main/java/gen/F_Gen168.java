
  package gen;
  public class F_Gen168 {
  		@com.google.inject.Inject
  		public F_Gen168(F_Gen169 f_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  