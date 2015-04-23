
  package gen;
  public class Q_Gen18 {
  		@com.google.inject.Inject
  		public Q_Gen18(Q_Gen19 q_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  