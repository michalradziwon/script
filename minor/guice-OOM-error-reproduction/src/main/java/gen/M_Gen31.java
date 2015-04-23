
  package gen;
  public class M_Gen31 {
  		@com.google.inject.Inject
  		public M_Gen31(M_Gen32 m_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  