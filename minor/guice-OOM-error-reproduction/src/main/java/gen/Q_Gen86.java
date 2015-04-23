
  package gen;
  public class Q_Gen86 {
  		@com.google.inject.Inject
  		public Q_Gen86(Q_Gen87 q_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  