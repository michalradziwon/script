
  package gen;
  public class F_Gen152 {
  		@com.google.inject.Inject
  		public F_Gen152(F_Gen153 f_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  