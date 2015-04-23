
  package gen;
  public class Q_Gen177 {
  		@com.google.inject.Inject
  		public Q_Gen177(Q_Gen178 q_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  