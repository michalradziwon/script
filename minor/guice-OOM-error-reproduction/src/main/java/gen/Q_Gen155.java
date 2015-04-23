
  package gen;
  public class Q_Gen155 {
  		@com.google.inject.Inject
  		public Q_Gen155(Q_Gen156 q_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  