
  package gen;
  public class F_Gen66 {
  		@com.google.inject.Inject
  		public F_Gen66(F_Gen67 f_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  