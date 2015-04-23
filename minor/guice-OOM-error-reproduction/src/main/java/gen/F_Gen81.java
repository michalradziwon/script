
  package gen;
  public class F_Gen81 {
  		@com.google.inject.Inject
  		public F_Gen81(F_Gen82 f_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  