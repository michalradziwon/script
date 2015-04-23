
  package gen;
  public class Q_Gen82 {
  		@com.google.inject.Inject
  		public Q_Gen82(Q_Gen83 q_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  