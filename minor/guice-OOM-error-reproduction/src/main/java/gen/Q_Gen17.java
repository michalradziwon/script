
  package gen;
  public class Q_Gen17 {
  		@com.google.inject.Inject
  		public Q_Gen17(Q_Gen18 q_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  