
  package gen;
  public class T_Gen89 {
  		@com.google.inject.Inject
  		public T_Gen89(T_Gen90 t_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  